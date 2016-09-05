package com.hand.AOP;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.hand.Util.SpringBeanFactory;
import com.sakila.Entity.Address;
import com.sakila.Entity.Customer;
import com.sakila.Entity.Film;
import com.sakila.Entity.Language;
import com.sakila.MybatisImpl.AddressDaoSp;
import com.sakila.MybatisImpl.LanguageDaoSp;

/*import com.sakila.Entity.Address;
import com.sakila.Entity.Film;
import com.sakila.MybatisImpl.AddressDaoSp;
*/
public class TransactionTool {
	PlatformTransactionManager ptm;
	TransactionTemplate tt;
	
	public PlatformTransactionManager getPtm() {
		return ptm;
	}
    public void setPtm(PlatformTransactionManager ptm) {
		this.ptm = ptm;
	}

    
	public TransactionTemplate getTt() {
		return tt;
	}
	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doFilmAddIdEntityTransaction(final Film aim){
		tt.execute(new TransactionCallback() {
			public Object doInTransaction(TransactionStatus status){
				try{
					SpringBeanFactory.getBeanFactory().getBean("FilmDao", CanAddToDb.class).AddIdEntity(aim);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("添加Film失败，执行回滚\n原因："+e.getMessage());
				}
				return null;
			}
		});
	}
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Film doFilmGetLastFilmTransaction(){
		return (Film) tt.execute(new TransactionCallback() {
			public Film doInTransaction(TransactionStatus status){
				Film res=null;
				try{
					res=(Film) SpringBeanFactory.getBeanFactory().getBean("FilmDao", CanAddToDb.class).getLastFilm();
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("获取LastFilm失败，执行回滚\n原因："+e.getMessage());
				}
				return res;
			}
		});
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int doLanguageGetCountByIdTransaction(final int addNum){
		return  tt.execute(new TransactionCallback() {
			public Integer doInTransaction(TransactionStatus status){
				int res=0;
				try{
					res=SpringBeanFactory.getBeanFactory().getBean("LanguageDao", LanguageDaoSp.class).getCountById(addNum);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("获取AddressCount失败，执行回滚\n原因："+e.getMessage());
				}
				return res;
			}
		});
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Language doLanguageGetByIDTransaction(final int addNum){
		return (Language) tt.execute(new TransactionCallback() {
			public Language doInTransaction(TransactionStatus status){
				Language res=null;
				try{
					res=(Language) SpringBeanFactory.getBeanFactory().getBean("LanguageDao", LanguageDaoSp.class).getByID(addNum);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("获取LastFilm失败，执行回滚\n原因："+e.getMessage());
				}
				return res;
			}
		});
	}
	
}

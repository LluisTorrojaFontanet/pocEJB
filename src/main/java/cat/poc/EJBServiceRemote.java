package cat.poc;

import javax.ejb.Remote;

@Remote
public abstract interface EJBServiceRemote {
	public abstract String doTheJob(String paramString);
}
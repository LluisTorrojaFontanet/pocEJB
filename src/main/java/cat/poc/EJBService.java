package cat.poc;

import javax.ejb.Stateless;

@Stateless
public class EJBService implements EJBServiceRemote {
	public EJBService() {
	}

	public String doTheJob(String parm) {
		String ret = "EJBService.doThejob invoked: parameters [" + parm + "]";
		return ret;
	}
}
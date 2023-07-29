public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log mesajı");

        BaseLogger[] loggers = new BaseLogger[]{new DataBaseLogger() , new FileLogger(), new EmailLogger(),new ConsoleLogger()};

        for (BaseLogger logger:loggers){
            logger.log("Loglandı!");
        }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();

    }
}
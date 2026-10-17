package lk.rasheeda.oodp.practical;

public class Filter3 extends Handler{
    @Override
    public void handleRequest(Request request) {
        if ("abc".equals(request.getParameter("username"))
                && "123".equals(request.getParameter("password"))) {
            System.out.println("Filter 3 : Valid Username and Password...");
            System.out.println("Requested Accepted...");

        }else {
            System.out.println("Filter 3 : Invalid Username and Password...");
        }
    }
}

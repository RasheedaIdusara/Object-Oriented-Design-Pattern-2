package lk.rasheeda.oodp.practical;

public class Filter1 extends Handler{

    @Override
    public void handleRequest(Request request) {

        if (request.getUrl().endsWith(".jsp")) {
            System.out.println("Filter 1 : Valid JSP URL...");

            if(this.getHandler()!=null){
                this.getHandler().handleRequest(request);
            }

        }else{
            System.out.println("Filter 2 : Invalid JSP URL...");
        }

    }
}

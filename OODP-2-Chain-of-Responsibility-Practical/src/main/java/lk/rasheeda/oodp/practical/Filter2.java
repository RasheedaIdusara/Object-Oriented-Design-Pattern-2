package lk.rasheeda.oodp.practical;

public class Filter2 extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.hasParameter("username") && request.hasParameter("password")) {
            System.out.println("Filter2 : Valid Parameters...");

            if (this.getHandler()!=null){
                this.getHandler().handleRequest(request);
            }
        }else {
            System.out.println("Filter2 : Invalid Parameters");
        }
    }
}

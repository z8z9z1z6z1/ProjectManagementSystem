package common.page.model;

public class Page {
     private int totalcount; // 總筆數
     private int current; // 目前所在頁數
     private int total_page;// 總頁數

     public Page(int totalcount, int current, int total_page) {
          super();
          this.totalcount = totalcount;
          this.current = current;
          this.total_page = total_page;
     }

     public int getCurrent() {
          return current;
     }

     public void setCurrent(int current) {
          this.current = current;
     }

     public int getTotal_page() {
          return total_page;
     }

     public void setTotal_page(int total_page) {
          this.total_page = total_page;
     }

     public int getTotalcount() {
          return totalcount;
     }

     public void setTotalcount(int totalcount) {
          this.totalcount = totalcount;
     }

}

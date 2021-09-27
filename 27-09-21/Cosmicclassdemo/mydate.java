package mydatepack;



    //to illustrate equal() and hashCode() methods of Object class
//illustrating the overriding of equals() and hashCode(0 methods
    public class mydate {
        private int dd;
        private int mm;
        private int yy;

        public mydate(int dd, int mm, int yy) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        @Override
        public int hashCode() {
            return(dd^mm^yy);//XOR operatorr taken to give hashcode,can also give any number
           /* return 1234;*/
        }

        @Override
        public boolean equals(Object obj) {
            //parent class---> object
            //reference --->obj
            mydatepack.mydate d=(mydatepack.mydate) obj;
            //this--->m1     obj--->m2/m3
            if((this.dd==d.dd) && (this.mm==d.mm) && (this.yy==d.yy))
                return  true;
            else
                return false;


        }

        @Override
        public String toString() {
            return "mydate{" +
                    "dd=" + dd +
                    ", mm=" + mm +
                    ", yy=" + yy +
                    '}';
        }
    }



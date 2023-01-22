package  Lab_3;


public class Mobile3 {


        public Mobile2 mobile2;

        public Mobile3(Mobile2 mobile2) {
            this.mobile2 = mobile2;
        }
        private int priceMobile() {
            return Mobile2.mobile.priceMobile();
        }

        public int getPriceMobile() {
            return priceMobile();
        }
        private int priceMobile(int coupon) {
           return mobile2.priceMobile(coupon);
       }

        public int getPriceMobile(int coupon) {
           return priceMobile(coupon);
       }

        private void advertisement() {
            mobile2.advertisement();
        }

        public void getAdvertisement() {
            advertisement();
        }

   }



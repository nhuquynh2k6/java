        package TH3;
        class Motorbike
        {
            public String manufacturer;
            public String serialNumber;
            public String model;
            private double productionCost;
            public int productionYear;
            public Motorbike() {}
        public Motorbike(String s_manufacturer, String s_serialNumber, String s_model, double f_productionCost, int i_productionYear)
        {
            manufacturer=s_manufacturer;
            serialNumber=s_serialNumber;
            model=s_model;
            productionCost=f_productionCost;
            productionYear=i_productionYear;
        }  
        public double getProductionCost()
        {
            return productionCost;
        }
        public void setProductionCost(double productionCost)
        {
            this.productionCost=productionCost;
        }
        public double calculatePrice()
        {
                return 1.5*productionCost;
        }
        public String getModelName() {
            return this.model;
        }
        public void displayInfo() {
        System.out.println("Nha san xuat: " + manufacturer);
        System.out.println("So Serial: " + serialNumber);
        System.out.println("Mau xe (Model): " + model);
        System.out.println("Chi phi san xuat: " + productionCost + " VND");
        System.out.println("Nam san xuat: " + productionYear);
        System.out.println("Gia ban dinh muc: " + calculatePrice() + " VND");
    }
}

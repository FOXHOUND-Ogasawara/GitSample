class MemberDetails extends Member {
    // Q11
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void showHeight() {
        System.out.println("身長は" + this.height + "cmです");
    }

    // Q12
    public MemberDetails(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = setHeight();
    }

    // Q13
    @override
    public showProperties(){
        System.out.println("身長: " + height + "cm");
    }
 }
public class generic <a,b>{
    a obj;
    b obj1;

    public generic(a obj, b obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }
    public boolean morethan() {
        if(obj.price>obj1.price) {
            return true;
        }
        return false;
    }
}

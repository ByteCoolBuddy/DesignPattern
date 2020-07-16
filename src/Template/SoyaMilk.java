package Template;

import sun.plugin2.gluegen.runtime.StructAccessor;

public abstract class  SoyaMilk{
    //模板方法 make 可以作为final，不让子类去覆盖
        final void make(){
            select();
            if(customerWantCandiments()){
                addCondiments();
            }

            soak();
            beat();
        }

        private void select(){
            System.out.println("1.选择豆子");
        }
        abstract void addCondiments();
        private void soak(){
            System.out.println("3.浸泡豆子");
        }
        private void beat(){
            System.out.println("4.打碎豆子");
        }

        //钩子方法，决定是否需要添加配料。
        boolean customerWantCandiments(){
            return true;
        }
}

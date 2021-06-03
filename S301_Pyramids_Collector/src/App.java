import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        PyramidDao pyramid = new PyramidDaoImp();
        // print file
        // System.out.println(pyramid.getAllPyramids());        
        // number of pyramids
        System.out.println(pyramid.getAllPyramids().size());
        int i = 0;
        for(Pyramid p : pyramid.getAllPyramids()){
            System.out.println("#"+ i++ +"\t"+p);
        }
        Collections.sort(pyramid.getAllPyramids(),new PyramidComparator());
        for(Pyramid p : pyramid.getAllPyramids()){
            System.out.println(p.getHeight()+"\t"+"->"+"\t"+p.getModern_name());
        }

        System.out.println(pyramid.getNoPyramidsPerSite());
    }
}

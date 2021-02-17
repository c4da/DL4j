import org.nd4j.linalg.api.ndarray.INDArray;

public class DL4jExtension(){

  public DL4jExtension(){}

  public double getVectorAngle(INDArray v2, INDArray v1){
          INDArray a = Transforms.dot(v1, v2);
          double angle = Math.acos(a.getDouble()/(v1.norm1Number().doubleValue()*v2.norm1Number().doubleValue()));
          return angle;
      }
}

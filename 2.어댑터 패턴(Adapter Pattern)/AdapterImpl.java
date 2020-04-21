
public class AdapterImpl implements Adapter{
//	Math math;
	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		System.out.println("절반 함수 호출");
		return (float)Math.half(f.doubleValue());
	}
 
}

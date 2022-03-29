package lamdaEx.no_arguments_no_return;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

	@Override
	public void method() {
		System.out.println("MyFunctionalInterfaceImpl::method() invoke.");
		
	}	//

		
}

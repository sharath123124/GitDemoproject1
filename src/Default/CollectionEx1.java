package Default;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionEx1 {

	public static void main(String[] args) {
CopyOnWriteArrayList adata=new CopyOnWriteArrayList();
		
		adata.add(12);
		adata.add(123);
		adata.add(122);
		adata.add(142);
		adata.add(122);

		
		Iterator it=adata.iterator();		
		while(it.hasNext()){
			adata.add(40);  // fail safe
			System.out.println("printing with iterator "+ it.next());
		}

	}

}

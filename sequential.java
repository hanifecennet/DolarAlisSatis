
package ikincikisim;

public class sequential {
 
    void sirala()
    {
        dizi d[] = new dizi [116];
        
        for (int a = 0; a < 116; a++)
        {
            d[a] = new dizi();
            d[a].deger(a);
            d[a].tarih(a);
        }
        
        double enBuyuk = d[0].z;
        double enKucuk = d[0].z;
        int kucukTarih = d[0].x;
        int buyukTarih = d[0].x;
        
        for ( int b = 0; b < d.length; b++)
        {
            if (d[b].z < enKucuk)
            {
                enKucuk = d[b].z;
                kucukTarih = d[b].x;
            }
        }
        
        for (int b = 0; b < d.length; b++)
        {
            if(d[b].z > enBuyuk )
            {
                buyukTarih = d[b].x;
                if (buyukTarih > kucukTarih)
                {
                    enBuyuk = d[b].z;
                }
            }
        }
        System.out.println("Sequential Dolasim");
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");  
        System.out.println(kucukTarih+". gun alip "+buyukTarih+". gun satabilirsiniz");
        System.out.println(enBuyuk-enKucuk+"tl kar ettiniz");
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
                
    }
}

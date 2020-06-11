public class Sunshine 
{ 
 
    static class Point  
    { 
        double x; 
        double y; 
  
        public Point(double x, double y) 
        { 
            this.x = x; 
            this.y = y; 
        } 
    }; 
    
    
    static double distance(Point p, Point q)  
    { 
        double val = Math.sqrt(((q.x - p.x) * (q.x - p.x)) + ((q.y - p.y) * (q.y - p.y))); 
            
         return val;
    } 
    
   
    static double find_surface(Point building_co[], Point p) 
    { 
        int n=building_co.length;
        
            double[] val=new double[n];
           
               for(int dist=0;dist<n;dist++)
                {
                    if(dist==0){
                    
                        val[dist]=distance(building_co[dist], building_co[dist+1])+distance(building_co[dist], building_co[n-1]);
                           
                    }
                    else if(dist==n-1)
                    {
                        val[dist] = distance(building_co[dist], building_co[dist-1])+distance(building_co[dist], building_co[0]);
                       
                    }
                    else
                    {
                       val[dist] = distance(building_co[dist], building_co[dist+1])+distance(building_co[dist], building_co[dist-1]);
                       
                    }
                    
                
                }
                
            double[] d_array=new double[n];
            int i=0;
            
        while(i<n){
            
            d_array[i]=distance(building_co[i], p);
            System.out.println(d_array[i]);
            i++;
        }
       
       
        double min=d_array[0];
        int arr_index=0;
        
        for(int k=0;k<n;k++){
            
            if(min>d_array[k]){
                min=d_array[k];
                arr_index=k;
            }
            
        }
        System.out.println(val[arr_index]);

        return 0; 
    } 
  
    public static void main(String[] args)  
    { 
        Point Building_co[] = {new Point(4, 0), 
                            new Point(4,-3),  
                            new Point(7, -5),  
                            new Point(7, 0)}; 
        
        Point p = new Point(1,1); 
         find_surface(Building_co, p); 
        
        
    } 
}

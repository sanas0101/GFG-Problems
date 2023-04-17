 int toyCount(int N, int K, vector<int> arr)
    {
        
        sort(arr.begin(),arr.end());
        
        long long int sum=0;
        long long int cnt=0;
        
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
            if(sum<=K){
            cnt++;
                
            }
            
        }
        return cnt;
    }

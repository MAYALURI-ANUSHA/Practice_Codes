'''
	Python3 program to store all the pairs while merging
	using Merge Sort Algorithm
	
'''

# Function to perform merge sort
# Time Complexity : O(N logN)
# Space Complexity : O(N) + O(Number Of Pairs)
def getPairsMerge(arr, l, r, mid, p):
	
	b = [0 for _ in range(l + r + 1)]
	i=l
	k=l
	j=mid+1;
	while(i<=mid and j<=r):
		if(arr[i]>arr[j]):
			b[k]=arr[j];
			p.append([arr[i],arr[j]]);
			p.append([arr[j],arr[i]]);
			p.append([arr[j],arr[j]]);
			k+= 1;
			j+= 1;
		
		else:
			p.append([arr[i],arr[j]]);
			p.append([arr[j],arr[i]]);
			p.append([arr[i],arr[i]]);
			b[k]=arr[i];
			i+= 1;
			k+= 1;
		
	

	while(i<=mid):
		b[k]=arr[i];
		p.append([arr[i],arr[i]]);
		i+= 1;
		k+= 1;
	
	while(j<=r):
		b[k]=arr[j];
		p.append([arr[j],arr[j]]);
		j+= 1;
		k+= 1;
	
	for x in range(l, r + 1):
		arr[x]=b[x];
	


# Function to get all pairs
def getAllPairs(arr, l, r, p):

	if(l<r):
		mid=int((l+r)/2);
		getAllPairs(arr,l,mid,p);
		getAllPairs(arr,mid+1,r,p);
		getPairsMerge(arr,l,r,mid,p);


# Driver code

n=2;
arr = [0 for _ in range(n)]
arr[0] = 1;
arr[1] = 2;
p = [];
getAllPairs(arr,0,n-1,p);

# Displaying the sorted pairs
for it in p:
	print(it[0], it[1])

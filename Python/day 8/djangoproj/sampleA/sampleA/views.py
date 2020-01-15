from django.http import HttpResponse
from django.shortcuts import render

def niit(requests):
	return HttpResponse("<h1> Hello World </h1>")
def home(requests):
#	return HttpResponse("<h2> This is home </h2>")
	return render(requests,'home.html',{'city':'Hyderabad','company':'Deloitte'})
def count(requests):
	data = requests.GET['full']
	# print(data)
	listw = data.split()
	userdict = {i:listw.count(i) for i in listw}
	temp = list(userdict.values())
	temp.sort(reverse=True)
	word = {}
	for i in temp:
		for j in userdict.keys():
			if(i==userdict[j]):
				word.update({j:i})
	return render(requests, 'count.html',{'dataname':data,'number':len(listw),'numbw':userdict,'sorted':word})

#!/usr/bin/env python
# coding: utf-8

# In[56]:


import pandas as pd
df1= pd.read_excel('Excel_old.xlsx')
df2= pd.read_excel('Excel_new.xlsx')
df1['id']=df1['Unique ID']+df1['Data Point']
df2['Id']=df1['Unique ID']+df1['Data Point']
       


# In[166]:


def create_dict(cid,c,df):
    dict_temp = {}
    df_temp = df 
    colid=cid
    col=c
    for row in range(0,df_temp.shape[0]):
        dict_temp[df_temp.iloc[row,colid]]=df_temp.iloc[row,col]
    return dict_temp


# In[167]:


list_old = []
for i in range(2,len(df1.columns)-1):
    list_old.append(create_dict(6,i,df1))
# print(list_old)


# In[168]:


list_new = []
for i in range(2,len(df2.columns)-1):
    list_new.append(create_dict(6,i,df2))
# print(list_new)


# In[169]:


list_diff = []
def diff_dict():
    for i in range(len(list_new)):
        temp = {}
        for key in list_new[i].keys():
            if key not in list_old[i].keys():
                temp[key] = list_new[i][key]
            else:
                temp[key] = list_new[i][key] - list_old[i][key]
        list_diff.append(temp)
    
    


# In[ ]:





# In[ ]:





# In[198]:


df_name1=pd.DataFrame({'Unique ID':df2['Unique ID'],'Data Point':df2['Data Point']})
def create_df():
    col_name = df2.columns[2:len(df2.columns)-1]
    for i in range(len(list_diff)):
#         print(col_name[i])
#         print(list_diff[i].values())
        df_name1[str(col_name[i])] = list_diff[i].values()

# df_name['a'] = list_diff[0].values()


# In[199]:


create_df()


# In[200]:


df_name1


# In[201]:


def color_red(value):
    color = 'red' if (value!=0 and type(value)!=str) else 'black'
    return 'color: %s' %color
df=df_name1.style.applymap(color_red)


# In[203]:


df
df.to_excel("Final.xlsx",index =False)


# In[ ]:





#!/usr/bin/env python
# coding: utf-8

# In[29]:


import pandas as pd
import sqlite3


# In[30]:


con = sqlite3.connect("chinook.db")
cur = con.cursor()
query = """ Select name from sqlite_master where type = "table" """


# In[31]:


res = cur.execute(query)
list_tables = res.fetchall()


# In[32]:


list_tables


# In[36]:


table_name_columns = {}
for t_name in list_tables:
    q1 = 'SELECT * FROM {}'.format(str(t_name[0]))
    cursor = con.execute(q1)
    #temp_name_columns = {}
    temp1 = []
    for i in range(len(cursor.description)):
        temp1.append(cursor.description[i][0])
    table_name_columns[str(t_name[0])] = temp1
   # table_name_columns.append(temp_name_columns)


# In[37]:


table_name_columns


# In[41]:


name_col = table_name_columns['playlists'][0]
for key in table_name_columns.keys():
    if name_col in table_name_columns[key]:
        new_table = key


# In[42]:


new_table


# In[43]:


q2 = "select * from {}".format(new_table)


# In[51]:


cur2 = con.execute(q2)


# In[52]:


playlist_track = cur2.fetchall()


# In[62]:


id = [1,3,5,8]
track_id = {}
for j in id:
    counter = 0
    temp = []
    for i in range(len(playlist_track)):
        if playlist_track[i][0] == j:
            if(counter!=10):
                counter+=1
                temp.append(playlist_track[i][1])
            else:
                break
    track_id[j] = temp   
        


# In[63]:


track_id


# In[67]:


name_col1 = table_name_columns['playlist_track'][1]
for key in table_name_columns.keys():
    if name_col1 in table_name_columns[key] and key != 'playlist_track':
        new_table1 = key


# In[68]:


new_table1


# In[69]:


q3 = "select * from {}".format(new_table1)
cur3 = con.execute(q3)


# In[70]:


tracks = cur3.fetchall()


# In[71]:


tracks


# In[75]:


track_name = {}
for id in track_id.keys():
    for i in track_id[id]:
        for j in range(len(tracks)):
            if tracks[j][0] == i:
                track_name[i]=[tracks[j][1],tracks[j][2]]
                
                


# In[76]:


track_name


# In[77]:


name_col2 = table_name_columns['tracks'][2]
for key in table_name_columns.keys():
    if name_col2 in table_name_columns[key] and key != 'tracks':
        new_table2 = key


# In[78]:


new_table2


# In[79]:


q4 = "select * from {}".format(new_table2)
cur4 = con.execute(q4)


# In[80]:


albums = cur4.fetchall()


# In[81]:


albums


# In[83]:


for id in track_name.keys():
        for j in range(len(albums)):
            if albums[j][0] == track_name[id][1]:
                track_name[id].append(albums[j][1])
                track_name[id].append(albums[j][2])


# In[84]:


track_name


# In[85]:


name_col3 = table_name_columns['albums'][2]
for key in table_name_columns.keys():
    if name_col3 in table_name_columns[key] and key != 'albums':
        new_table3 = key


# In[86]:


new_table3


# In[87]:


q5 = "select * from {}".format(new_table3)
cur5 = con.execute(q5)


# In[88]:


artists = cur5.fetchall()
artists


# In[89]:


for id in track_name.keys():
        for j in range(len(artists)):
            if artists[j][0] == track_name[id][3]:
                track_name[id].append(artists[j][1])


# In[92]:


track_name


# In[ ]:





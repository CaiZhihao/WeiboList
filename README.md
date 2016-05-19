# WeiboList
RecyclerView+CircleImageView+NineGridLayout实现微博列表


###运行效果图

![images](https://github.com/crazyfzw/ProjectImages/blob/master/WeiboList/S60519-223906.jpg)

![images](https://github.com/crazyfzw/ProjectImages/blob/master/WeiboList/S60519-223915.jpg)

![images](https://github.com/crazyfzw/ProjectImages/blob/master/WeiboList/S60519-223928.jpg)

![images](https://github.com/crazyfzw/ProjectImages/blob/master/WeiboList/S60519-223941.jpg)



###其中

#######1.使用到的CircleImageView 地址 https://github.com/hdodenhof/CircleImageView

#######2.NineGridLayout 为自定义控件，用于根据图片数量显示不同的图片布局

  1)、当只有1张图时，可以自己定制图片宽高

  2)、当只有4张图时，以2*2的方式显示；
    
  3）、除以上两种情况下，都是按照3列方式显示，但这时有一些细节：
    
        a、如果只有9张图，当然是以3*3的方式显示；
        
        b、如果超过9张图，可以设置是否全部显示。如果设置不完全显示，
        则按照3*3的方式显示，但是在第9张图上会有一个带“+”号的数字，
        代表还有几张没有显示，如果设置全部显示，理所当然的将所有图片都显示出来。
        
#######3、图片被按下时，会有一个变暗的效果，这也是模仿微信朋友圈的效果。



# ViewPagerTransforms


###Inculde
* Gradle

```
compile 'com.simplepeng.library:transformslibrary:1.0.0'
```

* Maven

```
 <dependency>
  <groupId>com.simplepeng.library</groupId>
  <artifactId>transformslibrary</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

###View Something

* CardSlideTransformer

![](https://raw.githubusercontent.com/simplepeng/ViewPagerTransforms/master/gifs/cardslide.gif)


* Flip3DTransform

![](https://raw.githubusercontent.com/simplepeng/ViewPagerTransforms/master/gifs/flip3d.gif)

* FlipHorizontalTransformer

![](https://raw.githubusercontent.com/simplepeng/ViewPagerTransforms/master/gifs/fliphorizontal.gif)

* RotateDownTransformer

![](https://raw.githubusercontent.com/simplepeng/ViewPagerTransforms/master/gifs/rotatedown..gif)

* ZoomInTransform

![](https://raw.githubusercontent.com/simplepeng/ViewPagerTransforms/master/gifs/zoomin.gif)

###Custom

继承TransformAdapter然后自定view的动画即可，例如：
```
public class ZoomBothTransform extends TransformAdapter {

    @Override
    public void onRightScorlling(View view, float position) {
        view.setScaleX(1 - position / 2);
        view.setScaleY(1 - position / 2);
    }

    @Override
    public void onLeftScorlling(View view, float position) {
        view.setScaleX(1 + position / 2);
        view.setScaleY(1 + position / 2);
    }

}
```
TransformAdapter有四个方法可供子类重写，看自己所需调用。
* onRightScorlling
```
/**
    * @param view     right view
    * @param position right to center 1->0
    *                 center to right 0->1
    */
   public void onRightScorlling(View view, float position) {

   }
```
* onLeftScorlling
```
/**
     * @param view     left view
     * @param position left to center  -1->0
     *                 center to left  0->-1
     */
    public void onLeftScorlling(View view, float position) {

    }
```

* onCenterIdle
```
public void onCenterIdle(View view) {

    }
```

* onTransform
```
/**
     *
     * @param view left and right view both callback
     * @param position [-1,1]
     */
    public void onTransform(View view, float position) {

    }
```

# ViewPagerTransforms


### Inculde
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

### useage
```
TransformUtil.reverse(mViewPager,new StackZoomInTransform());
```
or
```
TransformUtil.forward(mViewPager,new StackZoomInTransform());
```
### View

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

* other view library code

### Custom

extends TransformAdapter to custom view animations,for example:
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
TransformAdapter has 4 can override method
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

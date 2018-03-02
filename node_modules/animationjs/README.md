# animationjs

generate a animation.

## usage

```javascript
var animation = new lib.animation(
  1000,                   // duration(ms)
  lib.cubicbezier.ease,   // timingFunction
  function(i1, i2) {      // frame
    console.log(i1, i2);
  }
);

animation.play().then(function() {
  console.log('end');
});
```

import Share from "../../js/src";

if (window.Weex) {
  Weex.install(Share);
} else if (window.weex) {
  weex.install(Share);
}
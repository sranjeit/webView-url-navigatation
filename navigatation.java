public void goBackInWebView(){
    WebBackForwardList history = webView.copyBackForwardList();
    int index = 1;
    String url = null;
    int step = 1


for(i=0,i<= history.getSize(), i++){
if(history.getItemAtIndex(i).getUrl.contains("urlText")){
webView.goBackOrForward(index);
}
}


    while (webView.canGoBackOrForward(index)) {
          if (!history.getItemAtIndex(history.getCurrentIndex() + index).getUrl().equals("about:blank")) {
             webView.goBackOrForward(index);
             url = history.getItemAtIndex(-index).getUrl();
             Log.e("tag","first non empty" + url);
             break;
           }
           index --;

    }
   // no history found that is not empty
   if (url == null) {
      finish();
   }
}

package ru.ok.messages.video.fetcher.youtube.js;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import java.util.concurrent.atomic.AtomicReference;

public class JavaScriptInterface {
    public final j8e a;

    public JavaScriptInterface(j8e j8e) {
        this.a = j8e;
    }

    @JavascriptInterface
    @Keep
    public void returnResultToJava(String str) {
        j8e j8e = this.a;
        nvf nvf = (nvf) ((AtomicReference) j8e.c).getAndSet((Object) null);
        if (nvf != null) {
            ((Handler) j8e.o).post(new q36(str, 7, nvf));
        }
    }
}

package ru.ok.tamtam.android.widgets.quickcamera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class LibraryCameraApiView extends FrameLayout implements os1 {
    public LibraryCameraApiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View view = new View(context);
        view.setKeepScreenOn(true);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(File file) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d(ExecutorService executorService) {
    }

    public final void e() {
    }

    public final void f(boolean z) {
    }

    public final void g() {
    }

    public View getRootView() {
        return this;
    }

    public final void h() {
    }

    public final void i() {
    }

    public final boolean j() {
        return false;
    }

    public void setCameraListener(ju1 ju1) {
    }

    public void setFlash(String str) {
    }

    public void setPictureSize(gkb gkb) {
    }

    public void setVideoQuality(s7f s7f) {
    }
}

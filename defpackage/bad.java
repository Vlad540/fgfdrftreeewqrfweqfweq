package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* renamed from: bad  reason: default package */
public final class bad extends GLSurfaceView {
    public final aad a;

    /* JADX WARNING: type inference failed for: r3v2, types: [aad, java.lang.Object, android.opengl.GLSurfaceView$Renderer] */
    public bad(Context context) {
        super(context, (AttributeSet) null);
        setEGLContextClientVersion(2);
        ? obj = new Object();
        obj.Y = System.currentTimeMillis();
        this.a = obj;
        setRenderer(obj);
    }

    public final aad getRenderer() {
        return this.a;
    }
}

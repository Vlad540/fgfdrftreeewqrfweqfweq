package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* renamed from: n7a  reason: default package */
public final class n7a implements ko0 {
    public final t97 a;

    public n7a(t97 t97) {
        this.a = t97;
    }

    public void a(int i) {
        e().setAlpha(((float) i) / 255.0f);
    }

    public void b() {
        e().discardDisplayList();
    }

    public void c(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(e());
    }

    public void d(Bitmap bitmap, float f) {
        e().setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        e().beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        e().endRecording();
        e().setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
    }

    public RenderNode e() {
        return (RenderNode) this.a.getValue();
    }

    public n7a() {
        this.a = ez3.O(2, new k6b(27));
    }
}

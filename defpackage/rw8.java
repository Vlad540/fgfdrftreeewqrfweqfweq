package defpackage;

import android.text.TextPaint;

/* renamed from: rw8  reason: default package */
public final class rw8 extends kr7 {
    public final /* synthetic */ t97 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rw8(int i, t97 t97) {
        super(i);
        this.g = t97;
    }

    public final Object a(Object obj) {
        wia wia = (wia) obj;
        int intValue = ((Number) wia.a).intValue();
        float floatValue = ((Number) wia.b).floatValue();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(intValue);
        textPaint.setTextSize(floatValue);
        textPaint.linkColor = km4.y0.n(((p0a) ((jr0) this.g.getValue())).a).g().a().a(true).b.b;
        return textPaint;
    }
}

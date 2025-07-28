package defpackage;

/* renamed from: ut4  reason: default package */
public abstract class ut4 extends hi {
    public xv4 z0;

    public final boolean onTextContextMenuItem(int i) {
        return i == 16908322 ? ut4.super.onTextContextMenuItem(16908337) : ut4.super.onTextContextMenuItem(i);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [xv4, java.lang.Object, android.text.TextWatcher] */
    public void setReplaceTextSmiles(boolean z) {
        if (!z) {
            xv4 xv4 = this.z0;
            if (xv4 != null) {
                removeTextChangedListener(xv4);
                this.z0 = null;
            }
        } else if (this.z0 == null) {
            ? obj = new Object();
            this.z0 = obj;
            addTextChangedListener(obj);
        }
    }
}

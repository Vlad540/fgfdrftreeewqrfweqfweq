package defpackage;

/* renamed from: wc4  reason: default package */
public final /* synthetic */ class wc4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc4 b;

    public /* synthetic */ wc4(xc4 xc4, int i) {
        this.a = i;
        this.b = xc4;
    }

    public final void run() {
        int i = this.a;
        xc4 xc4 = this.b;
        switch (i) {
            case 0:
                xc4.getClass();
                try {
                    xc4.e.get();
                    xc4.m.decrementAndGet();
                    xc4.l.get();
                    xc4.toString();
                    return;
                } catch (Exception e) {
                    xc4.toString();
                    synchronized (xc4.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{xc4, Boolean.valueOf(xc4.c), Integer.valueOf(xc4.b)}), e);
                    }
                }
            case 1:
                xc4.a();
                return;
            default:
                xc4.b();
                return;
        }
    }

    public /* synthetic */ wc4(xc4 xc4, String str) {
        this.a = 0;
        this.b = xc4;
    }
}

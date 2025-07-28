package defpackage;

/* renamed from: jjc  reason: default package */
public abstract class jjc extends r37 {
    public m37 dequeueWork() {
        try {
            k37 k37 = this.mJobImpl;
            if (k37 != null) {
                return k37.b();
            }
            synchronized (this.mCompatQueue) {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                m37 remove = this.mCompatQueue.remove(0);
                return remove;
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new o37(this, 1);
    }
}

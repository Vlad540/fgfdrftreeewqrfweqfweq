package defpackage;

import android.os.AsyncTask;

/* renamed from: j37  reason: default package */
public final class j37 extends AsyncTask {
    public final /* synthetic */ r37 a;

    public j37(r37 r37) {
        this.a = r37;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        while (true) {
            r37 r37 = this.a;
            m37 dequeueWork = r37.dequeueWork();
            if (dequeueWork == null) {
                return null;
            }
            r37.onHandleWork(dequeueWork.getIntent());
            dequeueWork.a();
        }
    }

    public final void onCancelled(Object obj) {
        Void voidR = (Void) obj;
        this.a.processorFinished();
    }

    public final void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        this.a.processorFinished();
    }
}

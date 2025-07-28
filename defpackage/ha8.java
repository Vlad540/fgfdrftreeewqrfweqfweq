package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* renamed from: ha8  reason: default package */
public final class ha8 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ ia8 c;

    public ha8(ia8 ia8, int i, Context context) {
        this.c = ia8;
        this.a = i;
        this.b = context;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        SparseArray sparseArray = ia8.J0;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return am7.n(this.b, i);
        }
        return null;
    }

    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            ia8.J0.put(this.a, drawable.getConstantState());
        }
        this.c.y0 = null;
    }

    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        ia8 ia8 = this.c;
        if (drawable != null) {
            ia8.J0.put(i, drawable.getConstantState());
            ia8.y0 = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) ia8.J0.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            ia8.y0 = null;
        }
        ia8.setRemoteIndicatorDrawableInternal(drawable);
    }
}

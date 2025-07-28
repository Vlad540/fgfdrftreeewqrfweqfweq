package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mge  reason: default package */
public abstract class mge implements Parcelable {
    public static final lge a = new lge("");

    public final CharSequence a(Context context) {
        return b(context.getResources());
    }

    public final CharSequence b(Resources resources) {
        if (this instanceof hge) {
            return resources.getString(((hge) this).b);
        }
        if (this instanceof jge) {
            jge jge = (jge) this;
            Object[] array = jge.c.toArray(new Object[0]);
            return resources.getString(jge.b, Arrays.copyOf(array, array.length));
        } else if (this instanceof dge) {
            dge dge = (dge) this;
            int i = dge.c;
            return resources.getQuantityString(dge.b, i, new Object[]{Integer.valueOf(i)});
        } else if (this instanceof lge) {
            return ((lge) this).b;
        } else {
            if (this instanceof fge) {
                fge fge = (fge) this;
                Object[] array2 = fge.o.toArray(new Object[0]);
                return resources.getQuantityString(fge.b, fge.c, Arrays.copyOf(array2, array2.length));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final CharSequence c(View view) {
        return b(view.getContext().getResources());
    }
}

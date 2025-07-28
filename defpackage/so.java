package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: so  reason: default package */
public final class so implements View.OnClickListener {
    public final View a;
    public final String b;
    public Method c;
    public Context o;

    public so(View view, String str) {
        this.a = view;
        this.b = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.c == null) {
            View view2 = this.a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.c = method;
                            this.o = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder m = hr1.m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    m.append(view2.getClass());
                    m.append(str);
                    throw new IllegalStateException(m.toString());
                }
            }
        }
        try {
            this.c.invoke(this.o, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: jx5  reason: default package */
public final class jx5 implements LayoutInflater.Factory2 {
    public final c a;

    public jx5(c cVar) {
        this.a = cVar;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        e eVar;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        c cVar = this.a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, cVar);
        }
        a aVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kwb.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(kwb.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(kwb.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(kwb.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            int i = 0;
            try {
                z = a.class.isAssignableFrom(nx5.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    aVar = cVar.D(resourceId);
                }
                if (aVar == null && string != null) {
                    aVar = cVar.E(string);
                }
                if (aVar == null && i != -1) {
                    aVar = cVar.D(i);
                }
                if (aVar == null) {
                    nx5 J = cVar.J();
                    context.getClassLoader();
                    aVar = J.a(attributeValue);
                    aVar.D0 = true;
                    aVar.N0 = resourceId != 0 ? resourceId : i;
                    aVar.O0 = i;
                    aVar.P0 = string;
                    aVar.E0 = true;
                    aVar.J0 = cVar;
                    hx5 hx5 = cVar.w;
                    aVar.K0 = hx5;
                    Context context2 = hx5.B0;
                    aVar.G0(attributeSet, aVar.b);
                    eVar = cVar.a(aVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!aVar.E0) {
                    aVar.E0 = true;
                    aVar.J0 = cVar;
                    hx5 hx52 = cVar.w;
                    aVar.K0 = hx52;
                    Context context3 = hx52.B0;
                    aVar.G0(attributeSet, aVar.b);
                    eVar = cVar.g(aVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                by5 by5 = cy5.a;
                cy5.b(new Violation(aVar, "Attempting to use <fragment> tag to add fragment " + aVar + " to container " + viewGroup));
                cy5.a(aVar).getClass();
                aVar.X0 = viewGroup;
                eVar.k();
                eVar.j();
                View view2 = aVar.Y0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (aVar.Y0.getTag() == null) {
                        aVar.Y0.setTag(string);
                    }
                    aVar.Y0.addOnAttachStateChangeListener(new q40(this, eVar));
                    return aVar.Y0;
                }
                throw new IllegalStateException(wn6.i("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}

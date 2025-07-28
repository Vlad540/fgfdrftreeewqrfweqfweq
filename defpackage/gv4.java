package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: gv4  reason: default package */
public final class gv4 extends e07 {
    public final TextView g;
    public final eu4 h;
    public boolean i = true;

    public gv4(TextView textView) {
        this.g = textView;
        this.h = new eu4(textView);
    }

    public final void L(boolean z) {
        if (z) {
            TextView textView = this.g;
            textView.setTransformationMethod(N(textView.getTransformationMethod()));
        }
    }

    public final void M(boolean z) {
        this.i = z;
        TextView textView = this.g;
        textView.setTransformationMethod(N(textView.getTransformationMethod()));
        textView.setFilters(t(textView.getFilters()));
    }

    public final TransformationMethod N(TransformationMethod transformationMethod) {
        return this.i ? (!(transformationMethod instanceof lv4) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new lv4(transformationMethod) : transformationMethod : transformationMethod instanceof lv4 ? ((lv4) transformationMethod).a : transformationMethod;
    }

    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        if (!this.i) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof eu4) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            eu4 eu4 = this.h;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eu4;
                return inputFilterArr3;
            } else if (inputFilterArr[i5] == eu4) {
                return inputFilterArr;
            } else {
                i5++;
            }
        }
    }

    public final boolean z() {
        return this.i;
    }
}

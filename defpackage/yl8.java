package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: yl8  reason: default package */
public final class yl8 extends ibe implements MenuItem {
    public Method X;
    public final b4e o;

    public yl8(Context context, b4e b4e) {
        super(context);
        if (b4e != null) {
            this.o = b4e;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.o.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.o.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        o7 b = this.o.b();
        if (b instanceof vl8) {
            return ((vl8) b).c;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.o.getActionView();
        return actionView instanceof wl8 ? (View) ((wl8) actionView).a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.o.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.o.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.o.getContentDescription();
    }

    public final int getGroupId() {
        return this.o.getGroupId();
    }

    public final Drawable getIcon() {
        return this.o.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.o.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.o.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.o.getIntent();
    }

    public final int getItemId() {
        return this.o.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.o.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.o.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.o.getNumericShortcut();
    }

    public final int getOrder() {
        return this.o.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.o.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.o.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.o.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.o.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.o.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.o.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.o.isCheckable();
    }

    public final boolean isChecked() {
        return this.o.isChecked();
    }

    public final boolean isEnabled() {
        return this.o.isEnabled();
    }

    public final boolean isVisible() {
        return this.o.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        vl8 vl8 = new vl8(this, (Context) this.b, actionProvider);
        if (actionProvider == null) {
            vl8 = null;
        }
        this.o.a(vl8);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new wl8(view);
        }
        this.o.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.o.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.o.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.o.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.o.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.o.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.o.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.o.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.o.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.o.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.o.setOnActionExpandListener(onActionExpandListener != null ? new xl8(this, onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new y3e(this, onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.o.setShortcut(c, c2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.o.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.o.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.o.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.o.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.o.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.o.setVisible(z);
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.o.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.o.setIcon(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.o.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.o.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.o.setTitle(i);
        return this;
    }

    public final MenuItem setActionView(int i) {
        b4e b4e = this.o;
        b4e.setActionView(i);
        View actionView = b4e.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            b4e.setActionView(new wl8(actionView));
        }
        return this;
    }
}

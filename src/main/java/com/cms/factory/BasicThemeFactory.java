package com.cms.factory;

import com.cms.models.Theme;

public class BasicThemeFactory implements ThemeFactory {
    @Override
    public Theme createTheme(String name, String description) {
        Theme theme = new Theme();
        theme.setName(name);
        theme.setDescription(description);
        return theme;
    }
}

package com.cms.service;

import com.cms.models.Theme;
import com.cms.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {

    private final ThemeRepository themeRepository;

    @Autowired
    public ThemeService(ThemeRepository themeRepository) {
        this.themeRepository = themeRepository;
    }

    public List<Theme> findAll() {
        return themeRepository.findAll();
    }

    public Optional<Theme> findById(Long id) {
        return themeRepository.findById(id);
    }

    public Theme save(Theme theme) {
        return themeRepository.save(theme);
    }

    public Optional<Theme> update(Long id, Theme theme) {
        if (themeRepository.existsById(id)) {
            theme.setId(id);
            return Optional.of(themeRepository.save(theme));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        themeRepository.deleteById(id);
    }
}

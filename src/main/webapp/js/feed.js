/**
 * 
 */

document.addEventListener("DOMContentLoaded", () => {
    const profileToggle = document.getElementById('profileToggle');
    const profileDropdown = document.getElementById('profileDropdown');
    const logoutBtn = document.getElementById('logoutBtn');
    const logoutModal = document.getElementById('logoutModal');
    const cancelLogout = document.getElementById('cancelLogout');

    if (profileToggle) {
        profileToggle.addEventListener('click', (e) => {
            e.stopPropagation();
            profileDropdown.classList.toggle('active');
        });
    }

    document.addEventListener('click', (e) => {
        if (profileDropdown && profileDropdown.classList.contains('active')) {
            if (!profileDropdown.contains(e.target) && e.target !== profileToggle) {
                profileDropdown.classList.remove('active');
            }
        }
    });

    if (logoutBtn) {
        logoutBtn.addEventListener('click', (e) => {
            e.preventDefault();
            logoutModal.classList.add('active');
            profileDropdown.classList.remove('active'); 
        });
    }

    if (cancelLogout) {
        cancelLogout.addEventListener('click', () => {
            logoutModal.classList.remove('active');
        });
    }

    if (logoutModal) {
        logoutModal.addEventListener('click', (e) => {
            if (e.target === logoutModal) {
                logoutModal.classList.remove('active');
            }
        });
    }
});

const notificationToggle = document.getElementById('notificationToggle');
const notificationDropdown = document.getElementById('notificationDropdown');

if (notificationToggle && notificationDropdown) {
    notificationToggle.addEventListener('click', (e) => {
        e.stopPropagation();  
        notificationDropdown.classList.toggle('active');
        
        const profileDropdown = document.getElementById('profileDropdown');
        if (profileDropdown && profileDropdown.classList.contains('active')) {
            profileDropdown.classList.remove('active');
        }
    });
}

document.addEventListener('click', (e) => {
    if (notificationDropdown && notificationDropdown.classList.contains('active') && !notificationToggle.contains(e.target) && !notificationDropdown.contains(e.target)) {
        notificationDropdown.classList.remove('active');
    }
});
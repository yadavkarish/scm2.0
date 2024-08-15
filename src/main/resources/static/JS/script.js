document.addEventListener('DOMContentLoaded', () => {
    // Function to toggle the theme
    function toggleTheme() {
        const body = document.body;
        const button = document.getElementById('theme-toggle');
    
        // Toggle dark theme class on the body
        body.classList.toggle('dark');
    
        // Change button text and background color
        if (body.classList.contains('dark')) {
            button.innerHTML = '<i class="fa-solid fa-circle-half-stroke"></i> Light';
            button.style.backgroundColor = 'white'; // Light theme button background color
            button.style.color = '#0c2d49'; // Light theme button background color
            body.style.backgroundColor = '#111827'; // Dark theme background color
            body.style.color = '#fff'; // Dark theme text color
        } else {
            button.innerHTML = '<i class="fa-solid fa-circle-half-stroke"></i> Dark';
            button.style.backgroundColor = '#0c2d49'; // Dark theme button background color
            button.style.color = 'white';
            body.style.backgroundColor = '#fff'; // Light theme background color
            body.style.color = '#000'; // Light theme text color
        }
    }
    
    // Attach event listener to the button
    document.getElementById('theme-toggle').addEventListener('click', toggleTheme);
    });
    
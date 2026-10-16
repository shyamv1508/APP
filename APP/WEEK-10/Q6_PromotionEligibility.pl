% employee(Name, ExperienceYears, TrainingStatus, Rating).
employee(ravi, 6, completed, 5).
employee(priya, 3, completed, 4).
employee(kumar, 8, not_completed, 5).
employee(meena, 7, completed, 4).

% Promotion requires at least 5 years, completed training,
% and a performance rating of at least 4.
eligible(Name) :-
    employee(Name, Experience, completed, Rating),
    Experience >= 5,
    Rating >= 4.

% Query:
% ?- eligible(Name).
% Expected results: Name = ravi ; Name = meena.

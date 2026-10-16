% Student results: python(Student, Result).
python(arun, pass).
python(bala, pass).
python(charan, pass).
python(divya, fail).

% Student results: data_structures(Student, Result).
data_structures(arun, pass).
data_structures(bala, fail).
data_structures(charan, pass).
data_structures(divya, pass).

% A student is eligible only if both subjects are passed.
eligible(Student) :-
    python(Student, pass),
    data_structures(Student, pass).

% Query:
% ?- eligible(Student).
% Expected results: Student = arun ; Student = charan.

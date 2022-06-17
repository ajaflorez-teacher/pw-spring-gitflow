INSERT INTO career(id, name, facultad, tiempo, price) VALUES
	(1, 'Ingenieria de Sistemas de Información', 'Faculta de Ingenieria', 10, 12.5 ),
	(2, 'Ingenieria de Software', 'Faculta de Ingenieria', 10, 12.5 ),
	(3, 'Ciencias de la Computación', 'Faculta de Ingenieria', 6, 15 ),
	(4, 'Ingenieria Civil', 'Faculta de Ingenieria', 20, 16 );
	
INSERT INTO students(id, last_name, first_name, age, career_id) VALUES
	(1, 'Chura Molina', 'Ricardo', 58, 1),
	(2, 'Rosales Durand', 'Isabel', 20, 2),
	(3, 'Santander Lucas', 'Pedro', 21, 2);
	
INSERT INTO courses (id, name, level, credit, teacher_id) VALUES
('SI650', 'PROGRAMACION EN WEB', 6, 4, 1),
('SI385', 'IHC Y TECNOLOGIAS MOVILES', 4, 3, 1),
('cc123', 'PROGRAMACION I', 5, 1, 2),
('SI397', 'ESPECIFICACIÓN DE REQUISITOS', 3, 3, 2);